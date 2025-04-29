package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TreeNodeTest
{
    @Test
    void getleft()
    {
        Squirrel s1 = new Squirrel("Cheeks");
        Squirrel s2 = new Squirrel("Squeaks");
        Squirrel s3 = new Squirrel("Sandy");
        TreeNode root = new TreeNode(s1);
        TreeNode l = new TreeNode(s2);
        TreeNode r = new TreeNode(s3);
        root.set_left(l);
        root.set_right(r);
        TreeNode check = root.left();
        assertEquals(check.get_squirrel(), s2);

    }

    @Test
    void getright()
    {
        Squirrel s1 = new Squirrel("Cheeks");
        Squirrel s2 = new Squirrel("Squeaks");
        Squirrel s3 = new Squirrel("Sandy");
        TreeNode root = new TreeNode(s1);
        TreeNode l = new TreeNode(s2);
        TreeNode r = new TreeNode(s3);
        root.set_left(l);
        root.set_right(r);
        TreeNode check = root.right();
        assertEquals(check.get_squirrel(), s3);

    }

    @Test
    void getleft2()
    {
        Squirrel s1 = new Squirrel("Cheeks");
        Squirrel s2 = new Squirrel("Squeaks");
        Squirrel s3 = new Squirrel("Sandy");
        Squirrel s4 = new Squirrel("Rick");
        Squirrel s5 = new Squirrel("Marty");
        TreeNode root = new TreeNode(s1);
        TreeNode l = new TreeNode(s2);
        TreeNode r = new TreeNode(s3);
        TreeNode lr = new TreeNode(s4);
        TreeNode rl = new TreeNode(s5);
        root.set_left(l);
        root.set_right(r);
        l.set_right(lr);
        r.set_left(rl);
        TreeNode process = root.left();
        TreeNode check = process.right();
        assertEquals(check.get_squirrel(), s4);

    }

    @Test
    void getright2()
    {
        Squirrel s1 = new Squirrel("Cheeks");
        Squirrel s2 = new Squirrel("Squeaks");
        Squirrel s3 = new Squirrel("Sandy");
        Squirrel s4 = new Squirrel("Rick");
        Squirrel s5 = new Squirrel("Marty");
        TreeNode root = new TreeNode(s1);
        TreeNode l = new TreeNode(s2);
        TreeNode r = new TreeNode(s3);
        TreeNode lr = new TreeNode(s4);
        TreeNode rl = new TreeNode(s5);
        root.set_left(l);
        root.set_right(r);
        l.set_right(lr);
        r.set_left(rl);
        TreeNode process = root.right();
        TreeNode check = process.left();
        assertEquals(check.get_squirrel(), s5);

    }

    @Test
    void getleft3()
    {
        Squirrel s1 = new Squirrel("Cheeks");
        Squirrel s2 = new Squirrel("Squeaks");
        Squirrel s3 = new Squirrel("Sandy");
        Squirrel s4 = new Squirrel("Rick");
        Squirrel s5 = new Squirrel("Marty");
        Squirrel s6 = new Squirrel("Augustine");
        Squirrel s7 = new Squirrel("Phat Gus");
        TreeNode root = new TreeNode(s1);
        TreeNode l = new TreeNode(s2);
        TreeNode r = new TreeNode(s3);
        TreeNode lr = new TreeNode(s4);
        TreeNode rl = new TreeNode(s5);
        TreeNode lrl = new TreeNode(s6);
        TreeNode rlr = new TreeNode(s7);
        root.set_left(l);
        root.set_right(r);
        l.set_right(lr);
        r.set_left(rl);
        lr.set_left(lrl);
        rl.set_right(rlr);
        TreeNode process1 = root.left();
        TreeNode process2 = process1.right();
        TreeNode check = process2.left();
        assertEquals(check.get_squirrel(), s6);

    }

    @Test
    void getright3()
    {
        Squirrel s1 = new Squirrel("Cheeks");
        Squirrel s2 = new Squirrel("Squeaks");
        Squirrel s3 = new Squirrel("Sandy");
        Squirrel s4 = new Squirrel("Rick");
        Squirrel s5 = new Squirrel("Marty");
        Squirrel s6 = new Squirrel("Augustine");
        Squirrel s7 = new Squirrel("Phat Gus");
        TreeNode root = new TreeNode(s1);
        TreeNode l = new TreeNode(s2);
        TreeNode r = new TreeNode(s3);
        TreeNode lr = new TreeNode(s4);
        TreeNode rl = new TreeNode(s5);
        TreeNode lrl = new TreeNode(s6);
        TreeNode rlr = new TreeNode(s7);
        root.set_left(l);
        root.set_right(r);
        l.set_right(lr);
        r.set_left(rl);
        lr.set_left(lrl);
        rl.set_right(rlr);
        TreeNode process1 = root.right();
        TreeNode process2 = process1.left();
        TreeNode check = process2.right();
        assertEquals(check.get_squirrel(), s7);

    }

}