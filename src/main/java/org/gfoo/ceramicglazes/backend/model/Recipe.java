/**
 *
 */
package org.gfoo.ceramicglazes.backend.model;

/**
 * @author Gilles Faucherand
 *
 */
public class Recipe {

  private final Long id;
  private final String name;
  private final int stars;
  private final String content;

  public Recipe(Long id, String name, int stars, String content) {
    this.id = id;
    this.name = name;
    this.stars = stars;
    this.content = content;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getStars() {
    return stars;
  }

  public String getContent() {
    return content;
  }

}
