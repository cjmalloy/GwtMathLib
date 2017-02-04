package com.cjmalloy.math.shared.linear;

import java.io.Serializable;

/**
 * Vector model that uses floating point values.
 * 
 * <p>This is a mutable class, and all methods modify fields. Most methods
 * will return <code>this</code> for method chaining.</p>
 * 
 * <p>To preform operations without modification, call <code>copy()</code>
 * and chain the operation. For example:</p>
 * <code>
 * Vec2d newVec = oldVec.copy().add(1, 2);
 * </code>
 */
public class Vec2d implements Serializable {

  public double x;
  public double y;

  public Vec2d() {}

  public Vec2d(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public Vec2d(Vec2d p) {
    this(p.x, p.y);
  }

  /**
   * Add (x, y) to this vector.
   */
  public Vec2d add(double x, double y) {
    this.x += x;
    this.y += y;
    return this;
  }

  /**
   * Add a vector to this vector.
   */
  public Vec2d add(Vec2d p) {
    x += p.x;
    y += p.y;
    return this;
  }

  public Vec2d copy() {
    return new Vec2d(this);
  }

  /**
   * Divide the length by a scalar value.
   */
  public Vec2d divide(double s) {
    x /= s;
    y /= s;
    return this;
  }

  /**
   * Multiply the length by a scalar value.
   */
  public Vec2d multiply(double s) {
    x *= s;
    y *= s;
    return this;
  }

  /**
   * Setter.
   */
  public Vec2d set(Vec2d p) {
    x = p.x;
    y = p.y;
    return this;
  }

  /**
   * Subtract (x, y) from this vector.
   */
  public Vec2d subtract(int x, int y) {
    this.x -= x;
    this.y -= y;
    return this;
  }

  /**
   * Subtract a vector from this vector.
   */
  public Vec2d subtract(Vec2d p) {
    x -= p.x;
    y -= p.y;
    return this;
  }
}
