        Deque<String> deque = new LinkedList<>();
        deque.addFirst("a");
        deque.addLast("b");
        deque.addLast("c");
        System.out.println(deque);

        String str = deque.peekFirst();
        System.out.println(str);
        System.out.println(deque);

        while(deque.size() > 0){
        System.out.println(deque.pollFirst());
        }
        System.out.println(deque);
