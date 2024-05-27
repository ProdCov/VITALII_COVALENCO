package homework_nr_22;

public enum SQLQueries {
    
    INSERT_INTO_ALL_COLUMNS_QUERY("insert into students(name, age, grade) values (?, ?, ?)"),
    SELECT_ALL_COLUMN("select * from students"),
    UBDATE_BY_ID("UPDATE students SET grade = ? WHERE id = ?"),
    DELETE_BY_ID("delete from students where id = ?");
    
    final String Query;
    
    SQLQueries(String query) {
        Query = query;
    }
}
