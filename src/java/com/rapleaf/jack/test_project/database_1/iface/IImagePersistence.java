
/**
 * Autogenerated
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
/* generated from migration version 20110324000133 */
package com.rapleaf.jack.test_project.database_1.iface;

import com.rapleaf.jack.test_project.database_1.models.Image;
import java.io.IOException;

import com.rapleaf.jack.IModelPersistence;

public interface IImagePersistence extends IModelPersistence<Image> {
  public Image create(final Integer user_id) throws IOException;
}
