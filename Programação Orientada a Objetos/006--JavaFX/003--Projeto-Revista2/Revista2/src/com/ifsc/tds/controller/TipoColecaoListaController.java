package com.ifsc.tds.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.ifsc.tds.dao.TipoColecaoDAO;
import com.ifsc.tds.entity.TipoColecao;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;

public class TipoColecaoListaController implements Initializable{

    @FXML
    private SplitPane pnlDivisao;

    @FXML
    private TableView<TipoColecao> tbvTipoColecoes;

    @FXML
    private TableColumn<TipoColecao, Long> tbcCodigo;

    @FXML
    private TableColumn<TipoColecao, String> tbcNome;

    @FXML
    private Label lblDetalhes;

    @FXML
    private GridPane pnlDetalhes;

    @FXML
    private Label lblNome;

    @FXML
    private Label lblNomeValor;

    @FXML
    private ButtonBar barBotoes;

    @FXML
    private Button btnIncluir;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnExcluir;
    
    private List<TipoColecao> listaTipoColecoes;
    
    private ObservableList<TipoColecao> observableListaTipoColecoes = FXCollections.observableArrayList();

	private TipoColecaoDAO TipoColecaoDAO;
    
    public static final String TIPOCOLECAO_EDITAR = "Editar";
    
    public static final String TIPOCOLECAO_INCLUIR = "Incluir";
    
    @FXML
    void onClickBtnEditar(ActionEvent event) {

    }

    @FXML
    void onClickBtnExcluir(ActionEvent event) {

    }

    @FXML
    void onClickBtnIncluir(ActionEvent event) {

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.setTipoColecaoDAO(new TipoColecaoDAO());
		this.carregarTableViewTipoColecoes();
		this.selecionarItemTableViewTipoColecao(null);
		this.tbvTipoColecoes.getSelectionModel().selectedItemProperty().addListener(
				(observable, oldValue, newValue) -> selecionarItemTableViewTipoColecao(newValue));
		
		
	}

	public void carregarTableViewTipoColecoes() {
		this.tbcCodigo.setCellValueFactory(new PropertyValueFactory<>("id"));
		this.tbcNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		
		this.setListaTipoColecoes(this.getTipoColecaoDAO().getAll());
		this.setListaTipoColecoes(FXCollections.observableArrayList(this.getListaTipoColecoes()));
		this.tbvTipoColecoes.setItems(this.getObservableListaTipoColecoes());
	}
	
	public void selecionarItemTableViewTipoColecao(TipoColecao tipoColecao) {
		if(tipoColecao != null) {
			this.lblNomeValor.setText(tipoColecao.getNome());
		}
	}
	
	 public List<TipoColecao> getListaTipoColecoes() {
		return listaTipoColecoes;
	}

	public void setListaTipoColecoes(List<TipoColecao> listaTipoColecoes) {
		this.listaTipoColecoes = listaTipoColecoes;
	}

	public ObservableList<TipoColecao> getObservableListaTipoColecoes() {
		return observableListaTipoColecoes;
	}

	public void setObservableListaTipoColecoes(ObservableList<TipoColecao> observableListaTipoColecoes) {
		this.observableListaTipoColecoes = observableListaTipoColecoes;
	}

	public TipoColecaoDAO getTipoColecaoDAO() {
		return TipoColecaoDAO;
	}

	public void setTipoColecaoDAO(TipoColecaoDAO tipoColecaoDAO) {
		TipoColecaoDAO = tipoColecaoDAO;
	}
}
