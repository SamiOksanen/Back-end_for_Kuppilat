package arvostelut.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import arvostelut.bean.Arvostelu;
import arvostelut.dao.ArvosteluRowMapper;

@Repository
public class ArvosteluDAO {

	@Inject
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void talleta(Arvostelu ar) {
		final String sql = "INSERT INTO Arvostelu(paikka, paiva, arvosana, kuvaus) VALUES(?, ?, ?, ?)";

		final String paikka = ar.getPaikka();
		final String paiva = ar.getPaiva();
		final String arvosana = ar.getArvosana();
		final String kuvaus = ar.getKuvaus();

		KeyHolder idHolder = new GeneratedKeyHolder();

		jdbcTemplate.update(new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(
					Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(sql,
						new String[] { "id" });
				ps.setString(1, paikka);
				ps.setString(2, paiva);
				ps.setString(3, arvosana);
				ps.setString(4, kuvaus);
				return ps;
			}
		}, idHolder);

		ar.setId(idHolder.getKey().intValue());
	}
	
	public List<Arvostelu> haeKaikki() {
		String sql = "SELECT paikka, paiva, arvosana, kuvaus, id FROM Arvostelu";
		RowMapper<Arvostelu> mapper = new ArvosteluRowMapper();
		List<Arvostelu> arvostelut = jdbcTemplate.query(sql, mapper);

		return arvostelut;
	}
	
}
