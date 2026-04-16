class BrowserHistory {
    Stack<String>aage;
    Stack<String>peeche;
    public BrowserHistory(String homepage) {
        aage=new Stack<>();
        peeche=new Stack<>();
        peeche.add(homepage);
    }
    
    public void visit(String url) {
        aage=new Stack<>();
        peeche.push(url);
    }
    
    public String back(int steps) {
        int n=peeche.size();
        while(n>1 && steps>=1){
            aage.push(peeche.pop());
            steps--;
            n--;
        }
        // System.out.print(aage);
        // System.out.println(peeche);
        return peeche.peek();
    }
    
    public String forward(int steps) {
        // System.out.print(aage);
        // System.out.println(peeche);
        int n=aage.size();
        while(n>=1 && steps>=1){
            peeche.push(aage.pop());
            steps--;
            n--;
        }
        // System.out.print(aage);
        // System.out.println(peeche);

        return peeche.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */