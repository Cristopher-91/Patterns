package PatternVisitor;

public interface IVisitor {
    void visit(Milk milk);
    void visit(Cola cola);
    void visit(Beer beer);
}
