package org.arquillian.cube.kubernetes.impl.enricher.external;

import java.lang.annotation.Annotation;

import io.fabric8.kubernetes.api.model.ReplicationController;

import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.arquillian.test.spi.enricher.resource.ResourceProvider;

/**
 * A {@link ResourceProvider} for {@link io.fabric8.kubernetes.api.model.ReplicationControllerList}.
 * It refers to replication controllers that have been created during the current session.
 */
public class ReplicationControllerResourceProvider extends org.arquillian.cube.kubernetes.impl.enricher.internal.ReplicationControllerResourceProvider {
    @Override
    public boolean canProvide(Class<?> type) {
        return internalToUserType(ReplicationController.class.getName()).equals(type.getName());
    }

    @Override
    public Object lookup(ArquillianResource resource, Annotation... qualifiers) {
        return toUsersResource(super.lookup(resource, qualifiers));
    }
}
