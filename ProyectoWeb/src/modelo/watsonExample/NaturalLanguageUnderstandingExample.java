package modelo.watsonExample;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;
import com.ibm.watson.natural_language_understanding.v1.NaturalLanguageUnderstanding;
import com.ibm.watson.natural_language_understanding.v1.model.AnalysisResults;
import com.ibm.watson.natural_language_understanding.v1.model.AnalyzeOptions;
import com.ibm.watson.natural_language_understanding.v1.model.EntitiesOptions;
import com.ibm.watson.natural_language_understanding.v1.model.Features;
import com.ibm.watson.natural_language_understanding.v1.model.KeywordsOptions;

public class NaturalLanguageUnderstandingExample {

		public static void main(String[] args) {


			IamAuthenticator authenticator = new IamAuthenticator("IjsMKjYpIzoUqw-u8wQrj7INUFEZGxiwMDA8_aIXJv4f");
			NaturalLanguageUnderstanding service = new NaturalLanguageUnderstanding("2019-10-19", authenticator);
			service.setServiceUrl("https://gateway.watsonplatform.net/natural-language-understanding/api");


		     //The text we want to analyze. You can insert any other text you like.
		     String text = "IBM is an American multinational technology " +
		       "company headquartered in Armonk, New York, " +
		       "United States, with operations in over 170 countries.";
		     
		     //String text = "hola soy Nelson Gabriel Casas y estoy muy feliz de pertenecer a la Fuerza aérea Argentina en particular al UTN donde me " +
		     //"desempeño como docente de las materias técnicas digitales, electrónica y computadoras de aeronaves donde vamos a desarrollar software " +
		   // 		 "que incluya inteligencia artificial utilizando watson de IBM";

		     //Entities and keywords are parameters you get back from the service about your text.
		     EntitiesOptions entitiesOptions = new EntitiesOptions.Builder()
		       .emotion(true)
		       .sentiment(true)
		       .limit(2)
		       .build();

		     KeywordsOptions keywordsOptions = new KeywordsOptions.Builder()
		       .emotion(true)
		       .sentiment(true)
		       .limit(2)
		       .build();

		     Features features = new Features.Builder()
		       .entities(entitiesOptions)
		       .keywords(keywordsOptions)
		       .build();

		     AnalyzeOptions parameters = new AnalyzeOptions.Builder()
		       .text(text)
		       .features(features)
		       .build();

		     //Take the parameters and send them to your service for resutls.
		     Response<AnalysisResults> response = service
		       .analyze(parameters)
		       .execute();

		     //print the result
		     System.out.println(response.getResult());
		   }

		 }