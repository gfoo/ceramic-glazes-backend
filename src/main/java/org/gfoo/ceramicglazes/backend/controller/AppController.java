/**
 *
 */
package org.gfoo.ceramicglazes.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gilles Faucherand
 *
 */

@RestController
@RequestMapping(AppController.SERVICE_BASE_URI)
public class AppController {

  public static final String SERVICE_BASE_URI = "ceramic-glazes/v1";

  @GetMapping("/alive")
  public void alive() {
  }

}
