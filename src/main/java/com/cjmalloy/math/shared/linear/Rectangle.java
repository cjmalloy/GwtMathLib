package com.cjmalloy.math.shared.linear;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * Rectangle model that uses floating point values.
 * 
 * <p>This is a mutable class, and all methods modify fields. Most methods
 * will return <code>this</code> for method chaining.</p>
 * 
 * <p>To preform operations without modification, call <code>copy()</code>
 * and chain the operation. For example:</p>
 * <code>
 * Rectangle newRect = oldRect.copy().boundingRect(r);
 * </code>
 */
public class Rectangle implements IsSerializable {

  public double x;
  public double y;
  public double width;
  public double height;

  public Rectangle() {}

  /**
   * Constructor.
   */
  public Rectangle(double x, double y, double width, double height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public Rectangle(Rectangle r) {
    this(r.x, r.y, r.width, r.height);
  }

  /**
   * Return the smallest rectangle that includes both rectangles.
   */
  public Rectangle boundingRect(Rectangle r) {
    double ux = Math.min(r.x, x);
    double uy = Math.min(r.y, y);
    width = Math.max(r.x + r.width, x + width) - ux;
    height = Math.max(r.y + r.height, y + height) - uy;
    x = ux;
    y = uy;
    return this;
  }

  public boolean contains(double x, double y) {
    return x > this.x && x < this.x + this.width && y > this.y && y < this.y + this.height;
  }

  public boolean contains(Vec2d p) {
    return contains(p.x, p.y);
  }

  public Rectangle copy() {
    return new Rectangle(this);
  }

  /**
   * Setter.
   */
  public Rectangle set(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    return this;
  }
}
