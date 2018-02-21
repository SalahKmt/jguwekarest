package io.swagger.api.algorithm;

import io.swagger.api.NotFoundException;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.io.IOException;
import java.io.InputStream;


public abstract class RulesService {
    public abstract Response algorithmZeroRPost(InputStream fileInputStream, FormDataContentDisposition fileDetail, String datasetUri,
                                                String subjectid, HttpHeaders headers, UriInfo uriInfo) throws NotFoundException, IOException;
    public abstract Response algorithmM5RulesPost(InputStream fileInputStream, FormDataContentDisposition fileDetail, String datasetUri,
                                                  Integer unpruned, Integer useUnsmoothed, Double minNumInstances, Integer buildRegressionTree,
                                                  String subjectid, HttpHeaders headers, UriInfo uriInfo
                                                 ) throws Exception;
}