/*import java.io.File;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import org.json.JSONException;
import org.json.JSONObject;

import com.microsoft.azure.storage.CloudStorageAccount;
import com.microsoft.azure.storage.blob.CloudBlobClient;
import com.microsoft.azure.storage.blob.CloudBlobContainer;
import com.microsoft.azure.storage.blob.CloudBlockBlob;
import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

 

@Path("/upload")

public class FtoCService {

	private String storageConnectionString=
	 "DefaultEndpointsProtocol=http;" + 
	    "AccountName=danielfiletest;" + 
	    "AccountKey=NntZ4wYSLxyqxLJXTJUSCUscmZdO6BKN0KmZQU7pIUd31dba/k38T1jYimo+TuVy1EFrlJURWPFJ23RALur0Bw==";
	 
	
	  @POST
	  @Path("/mymethod")
	  @Consumes(MediaType.MULTIPART_FORM_DATA)
	  public  Response uploadFiletest(  
			   @FormDataParam("file") InputStream fileInputStream,
			   @FormDataParam("file") FormDataContentDisposition contentDispositionHeader
			  		) 
	  {

		JSONObject jsonObject = new JSONObject();
		Double fahrenheit = 98.24;
		Double celsius;
		celsius = (fahrenheit - 32)*5/9; 
		jsonObject.put("F Value", fahrenheit); 
		jsonObject.put("C Value", celsius);
		String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
		//  String result="success";
		return Response.status(200).entity(result).build();
	  }

	  @Path("{f}")
	  @GET
	  @Produces("application/json")
	  public Response convertFtoCfromInput(@PathParam("f") float f) throws JSONException {

		JSONObject jsonObject = new JSONObject();
		float celsius;
		celsius =  (f - 32)*5/9; 
		jsonObject.put("F Value", f); 
		jsonObject.put("C Value", celsius);
		UploadtoAzureStorage();
		String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	  }
	  
	  
	  public void UploadtoAzureStorage()
	  {
		  try
		  {
		      // Retrieve storage account from connection-string.
		      CloudStorageAccount storageAccount = CloudStorageAccount.parse(storageConnectionString);

		      // Create the blob client.
		      CloudBlobClient blobClient = storageAccount.createCloudBlobClient();

		     // Retrieve reference to a previously created container.
		      CloudBlobContainer container = blobClient.getContainerReference("mycontainer");

		      // Define the path to a local file.
		      final String filePath = "C:\\Users\\v-jayao\\Desktop\\Capture.PNG";

		      // Create or overwrite the "myimage.jpg" blob with contents from a local file.
		      CloudBlockBlob blob = container.getBlockBlobReference("myimage.jpg");
		      File source = new File(filePath);
		      blob.upload(new FileInputStream(source), source.length());
		  }
		  catch (Exception e)
		  {
		      // Output the stack trace.
		      e.printStackTrace();
		  }
	  }

}
*/