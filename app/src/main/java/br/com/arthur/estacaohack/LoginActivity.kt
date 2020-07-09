package br.com.arthur.estacaohack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Criando o clique do botão Entrar
        btnEntrar.setOnClickListener {
            //Recuperando valores digitados
            val usuario = edtUsuario.text.toString().trim()
            val senha = edtSenhaLogin.text.toString().trim()

            //Criando a condição para verificar se usuário e/ou senha estão vazios/corretos
            if(usuario.isEmpty()){
                txvResultado.text = "Usuário vazio!"
            }else if(senha.isEmpty()){
                txvResultado.text = "Senha vazia!"
            }else if(usuario == "Kaory"){
                if(senha == "1234"){
                    txvResultado.text = "Usuário logado"
                }else{
                    txvResultado.text = "Senha incorreta!"
                }
            }else{
                txvResultado.text = "Usuário incorreto!"
            }
        }
    }
}
