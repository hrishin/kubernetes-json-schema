package io.fabric8.schema;

import java.net.URI;
import java.net.URISyntaxException;


public class KubernetesSchema {
    public static URI getSchemaFile(String name) throws URISyntaxException {
        return KubernetesSchema.class.getResource("/schema/" + name + ".json").toURI();
    }
}
