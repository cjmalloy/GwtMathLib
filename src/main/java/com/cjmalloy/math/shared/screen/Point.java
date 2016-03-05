package com.cjmalloy.math.shared.screen;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * Point model that uses integer values.
 * 
 * <p>This is a mutable class, and all methods modify fields. Most methods
 * will return <code>this</code> for method chaining.</p>
 * 
 * <p>To preform operations without modification, call <code>copy()</code>
 * and chain the operation. For example:</p>
 * <code>
 * Point newPoint = oldPoint.copy().add(1, 2);
 * </code>
 */
public class Point implements IsSerializable {

  public int x;
  public int y;

  public Point() {}

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Point(Point p) {
    this(p.x, p.y);
  }

  /**
   * Add (x, y) to this point.
   */
  public Point add(int x, int y) {
    this.x += x;
    this.y += y;
    return this;
  }

  /**
   * Add a point to this point.
   */
  public Point add(Point p) {
    x += p.x;
    y += p.y;
    return this;
  }

  public Point copy() {
    return new Point(this);
  }

  /**
   * Divide the length by a scalar value.
   */
  public Point divide(double s) {
    x /= s;
    y /= s;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Point)) {
      return false;
    }
    Point p = (Point) o;
    return x == p.x && y == p.y;
  }

  @Override
  public int hashCode() {
    return ((x & 0xFFFF) << 0x1000) | y & 0xFFFF;
  }

  /**
   * Multiply the length by a scalar value.
   */
  public Point multiply(double s) {
    x *= s;
    y *= s;
    return this;
  }

  /**
   * Setter.
   */
  public Point set(Point p) {
    x = p.x;
    y = p.y;
    return this;
  }

  /**
   * Subtract (x, y) from this point.
   */
  public Point subtract(int x, int y) {
    this.x -= x;
    this.y -= y;
    return this;
  }

  /**
   * Subtract a point from this point.
   */
  public Point subtract(Point p) {
    x -= p.x;
    y -= p.y;
    return this;
  }

  @Override
  public String toString() {
    return "(" + x + ", " + y + ")";
  }
}
