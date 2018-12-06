package br.com.iagofontes.calculaflex

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.iagofontes.calculaflex.extension.getDoule
import br.com.iagofontes.calculaflex.watchers.DecimalTextWatcher
import kotlinx.android.synthetic.main.activity_form.*

class FormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        etGasPrice.addTextChangedListener(DecimalTextWatcher(etGasPrice))
        etEtanolPrice.addTextChangedListener(DecimalTextWatcher(etEtanolPrice))

        etGasAvarage.addTextChangedListener(DecimalTextWatcher(etGasAvarage, 1))
        etEtanolAvarage.addTextChangedListener(DecimalTextWatcher(etEtanolAvarage, 1))

        btCalcular.setOnClickListener {
            val proximaTela = Intent(this, ResultActivity::class.java)
            proximaTela.putExtra("GAS_PRICE", etGasPrice.getDoule())
            proximaTela.putExtra("ETANOL_PRICE", etEtanolPrice.getDoule())
            proximaTela.putExtra("GAS_AVARAGE", etGasAvarage.getDoule())
            proximaTela.putExtra("ETANOL_AVARAGE", etEtanolAvarage.getDoule())

            startActivity(proximaTela)

        }

    }
}
