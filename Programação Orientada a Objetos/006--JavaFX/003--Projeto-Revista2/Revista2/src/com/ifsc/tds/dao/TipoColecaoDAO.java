package com.ifsc.tds.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ifsc.tds.entity.TipoColecao;

public class TipoColecaoDAO implements DAO<TipoColecao> {

	@Override
	public TipoColecao get(Long id) {
		TipoColecao tipoColecao = null;
		String sql = "select * from tipo_colecao where id = ?";

		// conexão com o banco
		Connection conexao = null;

		// Criar uma preparação de consulta
		PreparedStatement stm = null;

		// Criar um objeto que receba a lista dos dados
		ResultSet rset = null;

		try {
			conexao = new Conexao().getConnection();

			stm = conexao.prepareStatement(sql);
			stm.setLong(1, id);
			rset = stm.executeQuery();

			while (rset.next()) {
				tipoColecao = new TipoColecao();

				// atribui o valor guardado de cada campo para atributo
				tipoColecao.setId(rset.getLong("id"));
				tipoColecao.setNome(rset.getString("nome"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stm != null) {
					stm.close();
				}

				if (conexao != null) {
					conexao.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return tipoColecao;
	}

	@Override
	public List<TipoColecao> getAll() {
		List<TipoColecao> tipoColecoes = new ArrayList<TipoColecao>();

		String sql = "select * from tipo_colecao";

		// conexão com o banco
		Connection conexao = null;

		// Criar uma preparação de consulta
		PreparedStatement stm = null;

		// Criar um objeto que receba a lista dos dados
		ResultSet rset = null;

		try {
			conexao = new Conexao().getConnection();

			stm = conexao.prepareStatement(sql);
			rset = stm.executeQuery();

			while (rset.next()) {
				TipoColecao tipoColecao = new TipoColecao();

				// atribui o valor guardado de cada campo para atributo
				tipoColecao.setId(rset.getLong("id"));
				tipoColecao.setNome(rset.getString("nome"));

				tipoColecoes.add(tipoColecao);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stm != null) {
					stm.close();
				}

				if (conexao != null) {
					conexao.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return tipoColecoes;

	}

	@Override
	public int save(TipoColecao tipoColecao) {
		String sql = "insert into tipo_colecao(nome) values(?)";

		// conexão com o banco
		Connection conexao = null;

		// Criar uma preparação de consulta
		PreparedStatement stm = null;

		try {
			conexao = new Conexao().getConnection();

			stm = conexao.prepareStatement(sql);
			stm.setString(1, tipoColecao.getNome());

			stm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stm != null) {
					stm.close();
				}

				if (conexao != null) {
					conexao.close();
				}

				return 1;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	@Override
	public boolean update(TipoColecao tipoColecao, String[] params) {
		String sql = "update tipo_colecao set nome = ? where id = ?";

		// conexão com o banco
		Connection conexao = null;

		// Criar uma preparação de consulta
		PreparedStatement stm = null;

		try {
			conexao = new Conexao().getConnection();

			stm = conexao.prepareStatement(sql);
			stm.setString(1, tipoColecao.getNome());
			stm.setLong(2, tipoColecao.getId());

			stm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stm != null) {
					stm.close();
				}

				if (conexao != null) {
					conexao.close();
				}

				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public boolean delete(TipoColecao tipoColecao) {
		String sql = "delete from tipo_colecao where id = ?";

		// conexão com o banco
		Connection conexao = null;

		// Criar uma preparação de consulta
		PreparedStatement stm = null;

		try {
			conexao = new Conexao().getConnection();

			stm = conexao.prepareStatement(sql);
			stm.setLong(1, tipoColecao.getId());

			stm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stm != null) {
					stm.close();
				}

				if (conexao != null) {
					conexao.close();
				}

				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}
}
