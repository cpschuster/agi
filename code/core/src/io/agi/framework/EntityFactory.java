package io.agi.framework;

import io.agi.core.orm.ObjectMap;
import io.agi.framework.persistence.models.ModelEntity;

/**
 * Created by dave on 14/02/16.
 */
public interface EntityFactory {

    /**
     * The node the Entities will run on. This is useful so you can pass the Node as the single point of access to all
     * other objects.
     *
     * @param n
     */
    void setNode( Node n );

    /**
     * Create an Entity on demand. Entities are created every time they are updated.
     * The factory does not create the config object in the entity (expressed as a string in the model).
     *
     * @param om
     * @param me
     * @return
     */
    Entity create( ObjectMap om, ModelEntity me ); //String entityName, String entityType );

}
