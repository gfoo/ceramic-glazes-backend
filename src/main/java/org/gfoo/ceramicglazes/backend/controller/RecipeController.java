/**
 *
 */
package org.gfoo.ceramicglazes.backend.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.gfoo.ceramicglazes.backend.model.Recipe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
/**
 * @author Gilles Faucherand
 *
 */
@RestController
@CrossOrigin
@RequestMapping(RecipeController.RECIPE_SERVICE_BASE_URI)
public class RecipeController {

  public static final String RECIPE_SERVICE_BASE_URI = AppController.SERVICE_BASE_URI
      + "/recipes";

  private final Logger LOG = LoggerFactory.getLogger(RecipeController.class);

  private Map<Long, Recipe> data = new HashMap<>();
  {
    data.put(1L, new Recipe(1L, "Tenmoku", 2,
        "TALC_2C=1.0, F_P_ICE10=4.0, Fe2O3=1.0, K_PUL=1.0, S_400=3.0, CA_CH=1.0"));
    data.put(2L, new Recipe(2L, "Glaçure pour grès incolore et mat", 5,
        "MA_KAOLINITE=15.0, ZnO=20.0, MA_BaCO3=12.0, MA_CRAIE=8.0, MA_ORTHOCLASE=60.0, MA_DOLOMIE=25.0"));
  }

  @GetMapping
  public Collection<Recipe> recipes() {
    LOG.info("will return recipe collection");
    return data.values();
  }

  @GetMapping("{id}")
  public Recipe recipes(@PathVariable final Long id) {
    LOG.info("will return recipe of id " + id);
    return data.get(id);
  }
}
