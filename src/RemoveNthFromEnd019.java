public class RemoveNthFromEnd019 {


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(-1);
        res.next = head;//ָ��ͷ��� return
        ListNode first = res;//����˫ָ�룬�ƶ���ͬ�ľ���
        ListNode second = res;//��firstΪ���һ���ڵ��� second���ǽ��n��ǰһ�����
        for(int i=0;i<n;i++){//����firstָ���n�����
            first = first.next;
        }
        while(first.next!=null){//һ���ƶ�
            first=first.next;
            second=second.next;
        }
        second.next = second.next.next;//ȥ�����n
        return res.next;
    }

}



