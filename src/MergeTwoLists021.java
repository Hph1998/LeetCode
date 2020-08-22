public class MergeTwoLists021 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1==null){//l1��ֱ�ӷ���l2
            return l2;
        }
        if(l2==null){//l2��ֱ�ӷ���l1
            return l1;
        }
        ListNode res = new ListNode();
        ListNode head = res;//������һ�����

        while(l1!=null&&l2!=null){//l1��l2����Ϊ�գ����бȽϣ�head����С�Ľ��
            if(l1.val>l2.val){
                head.next = new ListNode(l2.val);
                l2 = l2.next;
            }else{
                head.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            head=head.next;
        }
        if(l1==null){//ʣ���l2����head
            while(l2!=null){
                head.next = new ListNode(l2.val);
                l2 = l2.next;
                head=head.next;
            }
        }
        if(l2==null){//ʣ���l1����head
            while(l1!=null){
                head.next = new ListNode(l1.val);
                l1 = l1.next;
                head=head.next;
            }
        }
        return res.next;
    }

}
