package org.arquillian.cube.openshift.impl.enricher;

import io.fabric8.openshift.client.OpenShiftClient;
import org.arquillian.cube.kubernetes.impl.enricher.AbstractKubernetesResourceProvider;

public abstract class AbstractOpenshiftResourceProvider extends AbstractKubernetesResourceProvider {

    protected OpenShiftClient getOpenshiftClient() {
        return getClient().adapt(OpenShiftClient.class);
    }
}
