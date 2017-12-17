package pl.atena.dao.polisa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.Logger;

import pl.atena.core.BaseDao;
import pl.atena.core.connectors.DB;
import pl.atena.domain.polisa.Polisa;

public class PolisaDao implements BaseDao<Polisa> {

	private Logger log = Logger.getLogger(PolisaDao.class.getCanonicalName());

	public void create(Polisa entity) throws SQLException {
		Connection c = DB.get();

		PreparedStatement ps = c.prepareStatement(
				"INSERT INTO POLISA (NR_POLISY, D_PODPISANIA, D_ROZPOCZECIA, D_KONCA, SKLADKA) VALUES (?,?,?,?,?)",
				Statement.RETURN_GENERATED_KEYS);

		ps.setString(1, entity.getNrPolisy());
		ps.setString(2, entity.getdPodpisania().format(DateTimeFormatter.ISO_LOCAL_DATE));
		ps.setString(3, entity.getdRozpoczecia().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		ps.setString(4, entity.getdKonca().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		ps.setBigDecimal(5, entity.getSkladka());
		int row = ps.executeUpdate();
		if (row > 0) {
			ResultSet rs = ps.getGeneratedKeys();
			entity.setId(rs.getInt(1));
		}
		log.info("Dodano " + row + " wierszy do tabeli POLISA: " + entity);
	}

	public Polisa retrieve(Long id) throws SQLException {
		Connection c = DB.get();
		PreparedStatement ps = c.prepareStatement(
				"SELECT * FROM POLISA WHERE ID IN (?)",
				Statement.RETURN_GENERATED_KEYS);
		ps.setLong(1, id);
		return null;
	}

	public void update(Polisa entity) throws SQLException {
		Connection c = DB.get();
		PreparedStatement ps = c.prepareStatement(
				"UPDATE POLISA SET D_PODPISANIA = ?, D_ROZPOCZECIA = ?, D_KONCA = ?, SKLADKA = ? WHERE NR_POLISY IN (?)",
				Statement.RETURN_GENERATED_KEYS);
		ps.setString(5, entity.getNrPolisy());
		ps.setString(1, entity.getdPodpisania().format(DateTimeFormatter.ISO_LOCAL_DATE));
		ps.setString(2, entity.getdRozpoczecia().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		ps.setString(3, entity.getdKonca().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		ps.setBigDecimal(4, entity.getSkladka());
		log.info("Zmieniono dane polisy: " + entity);

	}

	public void delete(Polisa entity) throws SQLException {
		Connection c = DB.get();
		PreparedStatement ps = c.prepareStatement(
				"DELETE FROM POLISA WHERE NR_POLISY = (?)",
				Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, entity.getNrPolisy());
		int row = ps.executeUpdate();
		if (row > 0) {
			ResultSet rs = ps.getGeneratedKeys();
			entity.setId(rs.getInt(1));
		}
		log.info("Usuniêto polisê z bazy danych: " + entity.getNrPolisy());

	}

	public <F> List<Polisa> select(F filter) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
