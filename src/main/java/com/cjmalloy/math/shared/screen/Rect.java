package com.cjmalloy.math.shared.screen;

import java.io.Serializable;

/**
 * Rectangle model that uses integer values.
 * 
 * <p>This is a mutable class, and all methods modify fields. Most methods
 * will return <code>this</code> for method chaining.</p>
 * 
 * <p>To preform operations without modification, call <code>copy()</code>
 * and chain the operation. For example:</p>
 * <code>
 * Rect newRect = oldRect.copy().boundingRect(r);
 * </code>
 */
public class Rect implements Serializable {

  public int x;
  public int y;
  public int width;
  public int height;

  public Rect() {}

  /**
   * Constructor.
   */
  public Rect(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public Rect(Rect r) {
    this(r.x, r.y, r.width, r.height);
  }

  /**
   * Return the smallest rectangle that includes both rectangles.
   */
  public Rect boundingRect(Rect r) {
    int ux = Math.min(r.x, x);
    int uy = Math.min(r.y, y);
    width = Math.max(r.x + r.width, x + width) - ux;
    height = Math.max(r.y + r.height, y + height) - uy;
    x = ux;
    y = uy;
    return this;
  }

  public boolean contains(int x, int y) {
    return x > this.x && x < this.x + this.width && y > this.y && y < this.y + this.height;
  }

  public boolean contains(Point p) {
    return contains(p.x, p.y);
  }

  public Rect copy() {
    return new Rect(this);
  }

  /**
   * Setter.
   */
  public Rect set(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    return this;
  }
}
