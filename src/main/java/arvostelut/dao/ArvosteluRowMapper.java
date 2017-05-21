package arvostelut.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import arvostelut.bean.Arvostelu;


public class ArvosteluRowMapper implements RowMapper<Arvostelu>{

	public Arvostelu mapRow(ResultSet rs, int rowNum) throws SQLException{
		Arvostelu ar = new Arvostelu();
		ar.setId(rs.getInt("id"));
		ar.setPaikka(rs.getString("paikka"));
		ar.setPaiva(rs.getString("paiva"));
		ar.setArvosana(rs.getString("arvosana"));
		ar.setKuvaus(rs.getString("kuvaus"));
		
		return ar;
	}
}
