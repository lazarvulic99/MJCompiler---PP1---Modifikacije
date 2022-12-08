// generated with ast extension for cup
// version 0.8
// 28/7/2022 21:31:12


package rs.ac.bg.etf.pp1.ast;

public class Statements implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private StatementVector StatementVector;

    public Statements (StatementVector StatementVector) {
        this.StatementVector=StatementVector;
        if(StatementVector!=null) StatementVector.setParent(this);
    }

    public StatementVector getStatementVector() {
        return StatementVector;
    }

    public void setStatementVector(StatementVector StatementVector) {
        this.StatementVector=StatementVector;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(StatementVector!=null) StatementVector.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(StatementVector!=null) StatementVector.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(StatementVector!=null) StatementVector.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Statements(\n");

        if(StatementVector!=null)
            buffer.append(StatementVector.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Statements]");
        return buffer.toString();
    }
}
