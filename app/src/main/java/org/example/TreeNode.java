package org.example;

public class TreeNode
{
    private TreeNode leftNode;
    private TreeNode rightNode;
    private Squirrel data;

    public TreeNode(Squirrel data)
    {
        this.data = data;

    }

    public Squirrel get_squirrel()
    {
        return data;

    }

    public void set_left(TreeNode leftNode)
    {
        this.leftNode = leftNode;

    }

    public void set_right(TreeNode rightNode)
    {
        this.rightNode = rightNode;

    }

    public TreeNode left()
    {
        return leftNode;

    }

    public TreeNode right()
    {
        return rightNode;

    }

}