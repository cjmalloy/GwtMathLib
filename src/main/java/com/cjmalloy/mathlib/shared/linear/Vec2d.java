package com.cjmalloy.mathlib.shared.linear;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Vec2d implements IsSerializable
{

    public double x, y;

    public Vec2d()
    {}

    public Vec2d(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Vec2d(Vec2d p)
    {
        this(p.x, p.y);
    }

    public Vec2d add(double x, double y)
    {
        this.x += x;
        this.y += y;
        return this;
    }

    public Vec2d add(Vec2d p)
    {
        x += p.x;
        y += p.y;
        return this;
    }

    public Vec2d copy()
    {
        return new Vec2d(this);
    }

    public Vec2d divide(double s)
    {
        x /= s;
        y /= s;
        return this;
    }

    public Vec2d multiply(double s)
    {
        x *= s;
        y *= s;
        return this;
    }

    public Vec2d set(Vec2d p)
    {
        x = p.x;
        y = p.y;
        return this;
    }

    public Vec2d subtract(int x, int y)
    {
        this.x -= x;
        this.y -= y;
        return this;
    }

    public Vec2d subtract(Vec2d p)
    {
        x -= p.x;
        y -= p.y;
        return this;
    }
}
