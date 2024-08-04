package com.hobbydev.myandroidlayouts

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.MenuInflater
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import android.widget.SearchView

class MainActivity : AppCompatActivity() {

    private lateinit var buHome: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        initComponents()
        initUI()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.mainmenu, menu)

        val searchItem: MenuItem = menu.findItem(R.id.search_bar)
        val searchView: SearchView = searchItem.actionView as SearchView

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                // Acciones cuando se envía la búsqueda
                // Puedes agregar aquí tu lógica de búsqueda
                Toast.makeText(applicationContext, query, Toast.LENGTH_SHORT).show()
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                // Acciones cuando el texto cambia
                // Puedes agregar aquí tu lógica para filtrar resultados en tiempo real
                return false
            }
        })

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection.
        return when (item.itemId) {
            R.id.Home -> {
                Toast.makeText(this, "Home selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.Add -> {
                Toast.makeText(this, "Add selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.Setting -> {
                Toast.makeText(this, "Setting selected", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun initComponents(){
        buHome = findViewById(R.id.buHome)
    }
    private fun initUI(){
        buHome.text = getString(R.string.buhome)
        //String[] myarray = getString(R.array.myarray)
    }


}