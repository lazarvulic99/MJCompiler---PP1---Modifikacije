// generated with ast extension for cup
// version 0.8
// 28/7/2022 21:31:12


package rs.ac.bg.etf.pp1.ast;

public class ConstComma_ok extends ConstComma {

    private ConstantDecl ConstantDecl;

    public ConstComma_ok (ConstantDecl ConstantDecl) {
        this.ConstantDecl=ConstantDecl;
        if(ConstantDecl!=null) ConstantDecl.setParent(this);
    }

    public ConstantDecl getConstantDecl() {
        return ConstantDecl;
    }

    public void setConstantDecl(ConstantDecl ConstantDecl) {
        this.ConstantDecl=ConstantDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConstantDecl!=null) ConstantDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstantDecl!=null) ConstantDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstantDecl!=null) ConstantDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstComma_ok(\n");

        if(ConstantDecl!=null)
            buffer.append(ConstantDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstComma_ok]");
        return buffer.toString();
    }
}
