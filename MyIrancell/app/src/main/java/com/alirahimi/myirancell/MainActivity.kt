package com.alirahimi.myirancell

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.alirahimi.myirancell.navigation.BottomNavigationBar
import com.alirahimi.myirancell.navigation.SetupNavGraph
import com.alirahimi.myirancell.ui.screens.Splash
import com.alirahimi.myirancell.ui.screens.SplashScreen
import com.alirahimi.myirancell.ui.theme.MyIrancellTheme

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyIrancellTheme {

                navController = rememberNavController()


                Scaffold(
                    topBar = {},
                    floatingActionButton = {},
                    bottomBar = {
                        BottomNavigationBar(
                            navController = navController,
                            onItemClick = {
                                navController.navigate(it.route)
                            }
                        )
                    },
                ) {
                    SetupNavGraph(navController = navController)
                }
            }
        }
    }
}