package com.example.projetofiado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

@SuppressLint("NewApi")
public class ActivityMain extends Activity {

	final ArrayList<String> nomeVenda = new ArrayList<String>();
	ArrayList<String> array = new ArrayList<String>();
	
	public void addNomeVenda(String a){
		this.nomeVenda.add(a);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		telaLogin();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	private void telaLogin() {

		Button btLogin, btCadastre, btEsqueceuSenha;

		setContentView(R.layout.tela_login);

		btLogin = (Button) findViewById(R.id.btLogin);
		btCadastre = (Button) findViewById(R.id.btCadastrar);
		btEsqueceuSenha = (Button) findViewById(R.id.btEsqueceuSenha);

		btLogin.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaMenuPrincipal(false);
			}
		});

		btCadastre.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaCadastro();
			}

		});

		btEsqueceuSenha.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaLogin();
			}

		});

	}

	private void telaCadastro() {

		setContentView(R.layout.tela_cadastrese);

		Button btSalvar, btVoltar;

		btSalvar = (Button) findViewById(R.id.btSalvar);
		btVoltar = (Button) findViewById(R.id.btVoltar);

		btSalvar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				Toast t = Toast.makeText(ActivityMain.this,
						"Cadastro efetuado com Sucesso.", Toast.LENGTH_SHORT);
				t.show();

				telaLogin();
			}
		});

		btVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaLogin();
			}
		});

	}

	public void telaGerenciaDeVendas() {

		setContentView(R.layout.menu_venda);

		Button btNovaVenda, btBuscar, btExcluir, btVoltar;

		btNovaVenda = (Button) findViewById(R.id.btNovaVenda);
		btBuscar = (Button) findViewById(R.id.btBuscar);
		btExcluir = (Button) findViewById(R.id.btExcluir);
		btVoltar = (Button) findViewById(R.id.btVoltar);

		btNovaVenda.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaNovaVenda();
			}
		});

		btBuscar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaBuscarVenda();
			}

		});

		btExcluir.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaExcluirVenda();
			}

		});
		
		btVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaMenuPrincipal(true);
			}

		});

	}

	// ---------------------------------------------------------
	public void telaGerenciaDeProdutos() {

		setContentView(R.layout.menu_produto);

		Button btNovoProduto, btBuscar, btExcluir, btVoltar;

		btNovoProduto = (Button) findViewById(R.id.btAdicionarProduto);
		btBuscar = (Button) findViewById(R.id.btBuscarProduto);
		btExcluir = (Button) findViewById(R.id.btExcluirProduto);
		btVoltar = (Button) findViewById(R.id.btVoltar);

		btNovoProduto.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaNovoProduto();
			}
		});

		btBuscar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaBuscarProduto();
			}

		});

		btExcluir.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaExcluirProduto();
			}

		});

		btVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaMenuPrincipal(true);
			}

		});

	}

	protected void telaExcluirProduto() {
		setContentView(R.layout.tela_editarproduto);

		Button btSalvar, btVoltar;

		btSalvar = (Button) findViewById(R.id.btSalvar);
		btVoltar = (Button) findViewById(R.id.btVoltar);

		btSalvar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				Toast t = Toast.makeText(ActivityMain.this,
						"Produto removido com Sucesso.", Toast.LENGTH_SHORT);
				t.show();

				telaGerenciaDeProdutos();
			}
		});

		btVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaGerenciaDeProdutos();
			}
		});

	}

	protected void telaBuscarProduto() {
		// TODO Auto-generated method stub

	}

	protected void telaNovoProduto() {

		setContentView(R.layout.tela_cadastro_produto);

		Button btVoltar, btSalvar;

		btVoltar = (Button) findViewById(R.id.btVoltar);
		btSalvar = (Button) findViewById(R.id.btSalvar);

		btVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaGerenciaDeProdutos();
			}

		});

		btSalvar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				Toast t = Toast.makeText(ActivityMain.this,
						"Produto salvo com Sucesso.", Toast.LENGTH_SHORT);
				t.show();

				telaGerenciaDeProdutos();

			}
		});
	}

	// ===--------------------------------------------------------------------------
	private void telaExcluirVenda() {
		
		//setContentView(R.layout.tela_excluir);
		
		final ListView lvProdutos;
		Button btFinalizar;

		lvProdutos = (ListView) findViewById(R.id.lvProdutos);
		btFinalizar = (Button) findViewById(R.id.btFinalizar);
		
		popularListViewProdutosRemover(lvProdutos);
		
		btFinalizar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaGerenciaDeVendas();
			}

		});
		

	}

	private void telaBuscarVenda() {
		
		setContentView(R.layout.tela_buscarvenda);
		
		final ListView lvProdutos;
		Button btVoltar;

		lvProdutos = (ListView) findViewById(R.id.lvProdutos);
		btVoltar = (Button) findViewById(R.id.btVoltar);
		
		popularListViewProdutosComProdutosBusca(this.nomeVenda, lvProdutos);
		
		btVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaGerenciaDeVendas();
			}

		});

		
		
	}

	public void telaNovaVenda() {

		setContentView(R.layout.tela_novavenda);

		final ListView lvProdutos;
		ImageButton btAdd, btDelete;
		Button btVoltar, btProximo;
		final EditText nomeVenda;

		nomeVenda = (EditText) findViewById(R.id.campoNome);
		lvProdutos = (ListView) findViewById(R.id.lvProdutos);
		btAdd = (ImageButton) findViewById(R.id.btAdd);
		btDelete = (ImageButton) findViewById(R.id.btDelete);
		btVoltar = (Button) findViewById(R.id.btVoltar);
		btProximo = (Button) findViewById(R.id.btProximo);

		final ArrayList<String> produtosAdd = popularListViewProdutos(lvProdutos);
		
		this.array = produtosAdd;
		
		
		btAdd.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				addNomeVenda( nomeVenda.getText().toString());
				
				if (produtosAdd.isEmpty()) {
					Toast t = Toast.makeText(ActivityMain.this,
							"Voc� precisa cadastrar algum produto.", Toast.LENGTH_SHORT);
					t.show();

				} else {
					telaFormaDePagamento(produtosAdd);
				}
			}
		});

		btDelete.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				
				Toast t = Toast.makeText(ActivityMain.this, produtosAdd.size() +
						" produtos deselecionados.", Toast.LENGTH_SHORT);
				t.show();
				
				telaNovaVenda();

			}

		});

		btVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaGerenciaDeVendas();
			}

		});

		btProximo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				if (produtosAdd.isEmpty()) {
					Toast t = Toast.makeText(ActivityMain.this,
							"Voc� precisa cadastrar algum produto.", Toast.LENGTH_SHORT);
					t.show();

				} else {
					telaFormaDePagamento(produtosAdd);
				}

			}

		});

	}

	public ArrayList<String> popularListViewProdutos(ListView lvProdutos) {

		String[] values = new String[] { "Produto1", "Produto2", "Produto3",
				"Produto4", "Produto5", "Produto6", "Produto7", "Produto8",
				"Produto9", "Produto10" };

		final ArrayList<String> produtosAdd = new ArrayList<String>();

		final ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < values.length; ++i) {
			list.add(values[i]);
		}
		final StableArrayAdapter adapter = new StableArrayAdapter(this,
				android.R.layout.simple_list_item_1, list);
		lvProdutos.setAdapter((ListAdapter) adapter);

		lvProdutos
				.setOnItemClickListener(new AdapterView.OnItemClickListener() {

					@Override
					public void onItemClick(AdapterView<?> parent,
							final View view, int position, long id) {
						final String item = (String) parent
								.getItemAtPosition(position);
						view.animate().setDuration(2000).alpha(0)
								.withEndAction(new Runnable() {
									@Override
									public void run() {
										Toast t = Toast.makeText(ActivityMain.this,
												"Produto:" + item + " adicionado a lista de produtos.", Toast.LENGTH_SHORT);
										t.show();
										produtosAdd.add(item);
										//list.remove(item);
										adapter.notifyDataSetChanged();
										view.setAlpha(1);
									}
								});
					}

				});
		return produtosAdd;
	}

	public void popularListViewProdutosRemover(ListView lvProdutos) {

		String[] values = new String[] { "Produto1", "Produto2", "Produto3",
				"Produto4", "Produto5", "Produto6", "Produto7", "Produto8",
				"Produto9", "Produto10" };

		final ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < values.length; ++i) {
			list.add(values[i]);
		}
		final StableArrayAdapter adapter = new StableArrayAdapter(this,
				android.R.layout.simple_list_item_1, list);
		lvProdutos.setAdapter((ListAdapter) adapter);

		lvProdutos
				.setOnItemClickListener(new AdapterView.OnItemClickListener() {

					@Override
					public void onItemClick(AdapterView<?> parent,
							final View view, int position, long id) {
						final String item = (String) parent
								.getItemAtPosition(position);
						view.animate().setDuration(2000).alpha(0)
								.withEndAction(new Runnable() {
									@Override
									public void run() {
										Toast t = Toast.makeText(ActivityMain.this,
												"Produto:" + item + " removido com sucesso.", Toast.LENGTH_SHORT);
										t.show();
										list.remove(item);
										adapter.notifyDataSetChanged();
										view.setAlpha(1);
									}
								});
					}

				});
	}
	
	private class StableArrayAdapter extends ArrayAdapter<String> {

		HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

		public StableArrayAdapter(Context context, int textViewResourceId,
				List<String> objects) {
			super(context, textViewResourceId, objects);
			for (int i = 0; i < objects.size(); ++i) {
				mIdMap.put(objects.get(i), i);
			}
		}

		public long getItemId(int position) {
			String item = getItem(position);
			return mIdMap.get(item);
		}

		public boolean hasStableIds() {
			return true;
		}
	}

	private void telaFormaDePagamento(
			final ArrayList<String> produtosAdicionados) {

		setContentView(R.layout.tela_formapagamento);

		Button btVoltar, btFinalizar;

		btVoltar = (Button) findViewById(R.id.btVoltar);
		btFinalizar = (Button) findViewById(R.id.btFinalizar);

		btVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaNovaVenda();
			}

		});

		btFinalizar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaFinalizarVenda(produtosAdicionados);

			}

		});

	}

	protected void telaFinalizarVenda(
			final ArrayList<String> produtosAdicionados) {

		setContentView(R.layout.tela_finalizarvenda);

		ListView lvProdutos;
		Button btVoltar, btFinalizar;

		lvProdutos = (ListView) findViewById(R.id.lvProdutos);
		btVoltar = (Button) findViewById(R.id.btVoltar);
		btFinalizar = (Button) findViewById(R.id.btProximo);

		popularListViewProdutosComProdutos(produtosAdicionados, lvProdutos);

		btVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaFormaDePagamento(produtosAdicionados);
			}

		});

		btFinalizar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaMenuPrincipal(true);

			}

		});

	}

	private void popularListViewProdutosComProdutos(ArrayList<String> produtos,
			ListView lvProdutos) {

		final ArrayList<String> list = produtos;
		final StableArrayAdapter adapter = new StableArrayAdapter(this,
				android.R.layout.simple_list_item_1, list);
		lvProdutos.setAdapter((ListAdapter) adapter);

		lvProdutos
				.setOnItemClickListener(new AdapterView.OnItemClickListener() {

					@Override
					public void onItemClick(AdapterView<?> parent,
							final View view, int position, long id) {
						final String item = (String) parent
								.getItemAtPosition(position);
						view.animate().setDuration(2000).alpha(0)
								.withEndAction(new Runnable() {
									@Override
									public void run() {
										list.remove(item);
										adapter.notifyDataSetChanged();
										view.setAlpha(1);
									}
								});
					}

				});
	}
	
	private void popularListViewProdutosComProdutosBusca(ArrayList<String> produtos,
			final ListView lvProdutos) {

		final ArrayList<String> list = produtos;
		final StableArrayAdapter adapter = new StableArrayAdapter(this,
				android.R.layout.simple_list_item_1, list);
		lvProdutos.setAdapter((ListAdapter) adapter);

		lvProdutos
				.setOnItemClickListener(new AdapterView.OnItemClickListener() {


					@Override
					public void onItemClick(AdapterView<?> parent,
							final View view, int position, long id) {
						final String item = (String) parent
								.getItemAtPosition(position);
						view.animate().setDuration(2000).alpha(0)
								.withEndAction(new Runnable() {
									@Override
									public void run() {
										list.remove(item);
										adapter.notifyDataSetChanged();
										view.setAlpha(1);
									}
								});
						
						telaBuscarSegunda();
						
					}

				});
	}

	protected void telaBuscarSegunda() {

		//setContentView(R.layout.tela_buscarvenda_segunda);
		
		final ListView lvProdutos;
		Button btVoltar, btFinalizar;

		lvProdutos = (ListView) findViewById(R.id.lvProdutos);
		btVoltar = (Button) findViewById(R.id.btVoltar);
		btFinalizar = (Button) findViewById(R.id.btFinalizar);
		
		popularListViewProdutosComProdutos(this.array, lvProdutos);
		
		btFinalizar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaGerenciaDeVendas();
			}

		});
		
		btVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaBuscarVenda();
			}

		});

		
		
	}

	public void telaGerenciaDeClientes() {

		setContentView(R.layout.menu_cliente);

		Button btNovoCadastro, btVoltar;

		btNovoCadastro = (Button) findViewById(R.id.btNovoCadastroCliente);
		btVoltar = (Button) findViewById(R.id.btVoltar);
		
		btNovoCadastro.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaCadastroDeClientePrimeira();
			}
		});
		
		btVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaMenuPrincipal(true);
			}

		});

	}

	protected void telaCadastroDeClientePrimeira() {

		setContentView(R.layout.tela_cadastrocliente_primeira);

		Button btVoltar, btProximo;

		btVoltar = (Button) findViewById(R.id.btVoltar);
		btProximo = (Button) findViewById(R.id.btProximo);

		btVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaGerenciaDeClientes();
			}

		});

		btProximo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaCadastroDeClienteSegunda();

			}

			private void telaCadastroDeClienteSegunda() {

				setContentView(R.layout.tela_cadastrocliente_segunda);

				Button btVoltar, btProximo;

				btVoltar = (Button) findViewById(R.id.btVoltar);
				btProximo = (Button) findViewById(R.id.btProximo);

				btVoltar.setOnClickListener(new View.OnClickListener() {
					public void onClick(View arg0) {

						telaCadastroDeClientePrimeira();
					}

				});

				btProximo.setOnClickListener(new View.OnClickListener() {
					public void onClick(View arg0) {

						telaCadastroDeClienteFinal();

					}

					private void telaCadastroDeClienteFinal() {

						setContentView(R.layout.tela_cadastrocliente_final);

						Button btVoltar, btFinalizar;

						btVoltar = (Button) findViewById(R.id.btVoltar);
						btFinalizar = (Button) findViewById(R.id.btFinalizar);

						btVoltar.setOnClickListener(new View.OnClickListener() {
							public void onClick(View arg0) {

								telaCadastroDeClienteSegunda();
							}

						});

						btFinalizar
								.setOnClickListener(new View.OnClickListener() {
									public void onClick(View arg0) {

										telaGerenciaDeClientes();

									}

								});

					}

				});

			}

		});

	}

	public void telaMenuPrincipal(boolean perfil) {

		setContentView(R.layout.menu_principal);

		Button btGerVendas, btGerClientes, btGerProdutos, btSair;
		final Button btPerfil;

		btGerVendas = (Button) findViewById(R.id.btGerVendas);
		btGerClientes = (Button) findViewById(R.id.btGerenciarClientes);
		btGerProdutos = (Button) findViewById(R.id.btGerenciarProdutos);
		btSair = (Button) findViewById(R.id.btSair);
		btPerfil = (Button) findViewById(R.id.btPerfil);
		
		if(!perfil){
			btPerfil.setBackgroundColor(Color.YELLOW);
		}else{
			btPerfil.setBackgroundColor(Color.GREEN);
		}
		
		btGerVendas.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaGerenciaDeVendas();
			}
		});

		btGerClientes.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaGerenciaDeClientes();
			}
		});

		btGerProdutos.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaGerenciaDeProdutos();
			}
		});
		

		btPerfil.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaPerfil();
				
			}
		});
		
		btSair.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaLogin();
			}
		});

	}

	protected void telaPerfil() {

		setContentView(R.layout.tela_perfil);
		
		Button btVoltar, btSalvar;

		btVoltar = (Button) findViewById(R.id.btVoltar);
		btSalvar = (Button) findViewById(R.id.btSalvar);
		
		
		btVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaMenuPrincipal(true);
			}
		});

		btSalvar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				telaMenuPrincipal(true);
			}
		});
		
	}

}
