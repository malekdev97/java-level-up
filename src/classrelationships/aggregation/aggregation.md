Aggregation is also a “has-a” relationship. What distinguishes it from composition, that it doesn’t involve owning. As a result, the lifecycles of the objects aren’t tied: every one of them can exist independently of each other.

For example, a car and its wheels. We can take off the wheels, and they’ll still exist. We can mount other (preexisting) wheels, or install these to another car and everything will work just fine.

Of course, a car without wheels or a detached wheel won’t be as useful as a car with its wheels on. But that’s why this relationship existed in the first place: to assemble the parts to a bigger construct, which is capable of more things than its parts.

Since aggregation doesn’t involve owning, a member doesn’t need to be tied to only one container. For example, a triangle is made of segments. But triangles can share segments as their sides.