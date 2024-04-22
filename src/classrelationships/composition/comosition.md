Composition is a “belongs-to” type of relationship. It means that one of the objects is a logically larger structure, which contains the other object. In other words, it’s part or member of the other object.

Alternatively, we often call it a “has-a” relationship (as opposed to an “is-a” relationship, which is inheritance).

For example, a room belongs to a building, or in other words a building has a room. So basically, whether we call it “belongs-to” or “has-a” is only a matter of point of view.

Composition is a strong kind of “has-a” relationship because the containing object owns it. Therefore, the objects’ lifecycles are tied. It means that if we destroy the owner object, its members also will be destroyed with it. For example, the room is destroyed with the building in our previous example.

Note that doesn’t mean, that the containing object can’t exist without any of its parts. For example, we can tear down all the walls inside a building, hence destroy the rooms. But the building will still exist.

In terms of cardinality, a containing object can have as many parts as we want. However, all of the parts need to have exactly one container.

