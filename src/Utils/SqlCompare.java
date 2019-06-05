package Utils;

public class SqlCompare {
    private Object o2;
    private String relation;
    private String type;

    public SqlCompare(String relation, Object o2, String type){
        this.o2 = o2;
        this.relation = relation;
        this.type = type;
    }

    public boolean compare(Object o1){
        switch (this.relation){
            case "=":
                return o1.equals(this.o2);
            case "<>":
                return !o1.equals(this.o2);
            default:
        }
        switch (this.type){
            case "String":
                return false;
            case "Int":
            {
                switch (this.relation){
                    case "<":
                        return (Integer) o1 < (Integer) this.o2;
                    case ">":
                        return (Integer) o1 > (Integer) this.o2;
                    case "<=":
                        return (Integer) o1 <= (Integer) this.o2;
                    case ">=":
                        return (Integer) o1 >= (Integer) this.o2;
                    default:
                        return false;
                }
            }
            case "Float":
            {
                switch (this.relation){
                    case "<":
                        return (Float) o1 < (Float) this.o2;
                    case ">":
                        return (Float) o1 > (Float) this.o2;
                    case "<=":
                        return (Float) o1 <= (Float) this.o2;
                    case ">=":
                        return (Float) o1 >= (Float) this.o2;
                    default:
                        return false;
                }
            }
            case "Double":
            {
                switch (this.relation){
                    case "<":
                        return (Double) o1 < (Double) this.o2;
                    case ">":
                        return (Double) o1 > (Double) this.o2;
                    case "<=":
                        return (Double) o1 <= (Double) this.o2;
                    case ">=":
                        return (Double) o1 >= (Double) this.o2;
                    default:
                        return false;
                }
            }
            case "Long":
            {
                switch (this.relation){
                    case "<":
                        return (Long) o1 < (Long) this.o2;
                    case ">":
                        return (Long) o1 > (Long) this.o2;
                    case "<=":
                        return (Long) o1 <= (Long) this.o2;
                    case ">=":
                        return (Long) o1 >= (Long) this.o2;
                    default:
                        return false;
                }
            }
            default:
                return false;
        }
    }
}
