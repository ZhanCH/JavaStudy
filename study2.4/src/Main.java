//StringBuilder
public class Main {
    public static void main(String[] args) {
        String[] fields = {"name", "position", "salary"};
        String table = "employee";
        String insert1 = buildInsertSql(table, fields);
        String insert2 = buildInsertSql1(table, fields);
        System.out.println(insert1);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert1) ? "测试成功" : "测试失败");
        System.out.println(insert2);
        System.out.println(s.equals(insert2) ? "测试成功" : "测试失败");
    }

    static String buildInsertSql(String table, String[] fields) {
        StringBuilder sb = new StringBuilder(1024);
        sb.append("INSERT INTO ")
                .append(table)
                .append(' ')
                .append('(');
        for (int a = 0; a < fields.length; a++) {
            sb.append(fields[a]);
            if (a != fields.length - 1) {
                sb.append(',')
                        .append(' ');
            }
        }
        sb.append(") VALUES (?, ?, ?)");
        return sb.toString();
    }

    static String buildInsertSql1(String table, String[] fields) {
        StringBuilder sb = new StringBuilder(1024);
        for (int a = 0; a < fields.length; a++) {
            sb.append(fields[a]);
            if (a != fields.length - 1) {
                sb.append(',')
                        .append(' ');
            }
        }
        String x = sb.toString();
        return String.format("INSERT INTO %s (%s) VALUES (?, ?, ?)", table, x);
    }
}