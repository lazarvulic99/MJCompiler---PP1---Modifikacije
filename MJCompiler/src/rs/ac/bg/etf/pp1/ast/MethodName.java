// generated with ast extension for cup
// version 0.8
// 28/7/2022 21:31:12


package rs.ac.bg.etf.pp1.ast;

public class MethodName implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    public rs.etf.pp1.symboltable.concepts.Obj obj = null;

    private String imeMetode;

    public MethodName (String imeMetode) {
        this.imeMetode=imeMetode;
    }

    public String getImeMetode() {
        return imeMetode;
    }

    public void setImeMetode(String imeMetode) {
        this.imeMetode=imeMetode;
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
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethodName(\n");

        buffer.append(" "+tab+imeMetode);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethodName]");
        return buffer.toString();
    }
}
