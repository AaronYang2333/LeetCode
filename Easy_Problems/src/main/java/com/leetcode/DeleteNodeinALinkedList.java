package com.leetcode;

/**
 * Write a function to delete a node (except the tail) in a singly linked list,
 * given only access to that node.
 * <p>
 * The linked list will have at least two elements.
 * All of the nodes' values will be unique.
 * The given node will not be the tail and it will always be a valid node of the linked list.
 * Do not return anything from your function.
 *
 * @Author: Aaron Yang
 * @Date: 10/5/2018 5:24 PM
 */
public class DeleteNodeinALinkedList {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}

