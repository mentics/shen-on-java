package com.mentics.shenj;


public class Cons {
    public static Object makeCons(Object... os) {
        // TODO: fix this casting stuff
        Object c = Nil.NIL;
        for (int i = 0; i < os.length; i++) {
            c = new Cons(os[i], c);
        }
        return c;
    }


    public Object head;

    public Object tail;


    /**
     * This is for kryo to use. Don't use it.
     */
    public Cons() {
    }

    public Cons(Object head, Object tail) {
        this.head = head;
        this.tail = tail;
    }

    @Override
    public int hashCode() {
        // TODO: Cache?
        return head.hashCode() << 4 + tail.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof Cons) {
            Cons o = (Cons) other;
            return Lang.equals(this.head, o.head) && Lang.equals(this.tail, o.tail);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        if (Nil.NIL.equals(tail)) {
            return "[" + head + "]";
        } else if (tail instanceof Cons) {
            return "[" + head + " " + ((Cons) tail).continueString();
        } else {
            return "[" + head + " | " + tail.toString() + "]";
        }
    }

    public String continueString() {
        if (Nil.NIL.equals(tail)) {
            return head + "]";
        } else if (tail instanceof Cons) {
            return head + " " + ((Cons) tail).continueString();
        } else {
            return head + " | " + tail.toString() + "]";
        }
    }

    public Object forEach(Lambda1 f) throws Exception {
        if (head == null) {
            return Nil.NIL;
        }
        Object result = Nil.NIL;
        Object iterate = this;
        do {
            Object o = iterate instanceof Cons ? ((Cons) iterate).head : iterate;
            result = new Cons(f.apply(o), result);
            // result.add(f.apply(o));
            if (iterate instanceof Cons) {
                iterate = ((Cons) iterate).tail;
            } else {
                break;
            }
        } while (iterate != Nil.NIL);
        return reverse(result);
    }

    private Object reverse(Object o) {
        Object result = Nil.NIL;
        while (o instanceof Cons) {
            Cons oc = (Cons) o;
            result = new Cons(oc.head, result);
            o = oc.tail;
        }
        return result;
    }

    public static Object list(Object... objs) {
        Cons cons = new Cons(objs[0], Nil.NIL);
        for (int i = 1; i < objs.length; i++) {
            cons = new Cons(objs[i], cons);
        }
        return cons;
    }
}
