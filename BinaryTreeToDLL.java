class BinaryTreeToDLL
{
	Node head;
    Node prev = null;
    
    Node bToDLL(Node root)
    {
        if(root == null)
            return null;
            
        bToDLL(root.left);
        
        if(prev == null)
            head = root;
        else
        {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        
        bToDLL(root.right);
        
        return head;
    }
}