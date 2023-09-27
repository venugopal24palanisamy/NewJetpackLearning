package com.example.calculatorapp

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculatorapp.components.InstagramSignUp
import com.example.calculatorapp.ui.theme.CalculatorAppTheme
import com.example.calculatorapp.ui.theme.Green
import com.example.calculatorapp.ui.theme.Grey

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorAppTheme {
                //CalculatorView()
                InstagramSignUp()
            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun CalculatorView() {
        var a by remember { mutableStateOf("") }
        var b by remember { mutableStateOf("") }
        var c by remember { mutableStateOf("") }


        var weightError by remember { mutableStateOf("") }
        var heightError by remember { mutableStateOf("") }

        var isHeightError by remember { mutableStateOf(false) }
        var isWeightError by remember { mutableStateOf(false) }

        //fun subtraction(a: Float, b: Float): Float = a - b
       // fun multiplication(a: Float, b: Float): Float = a * b
       // fun division(a: Float, b: Float): Float = a / b

        fun validate(): Boolean {

            if (a.trim().isEmpty()) {
                weightError = "Enter Weight in Kg"
                isWeightError = true
                return false
            } else {
                isWeightError = false
            }

            if (b.trim().isEmpty()) {
                heightError = "Enter Height in m"
                isHeightError = true
                return true
            } else {
                isHeightError = false
            }

            return true
        }
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.White
        ) {
            Column(
                modifier = Modifier.padding(15.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextField(
                    value = a,
                    onValueChange = { a = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
                    placeholder = { Text(text = "Enter your Weight in Kg") }
                )

                Spacer(modifier = Modifier.height(15.dp))

                TextField(
                    value = b,
                    onValueChange = { b = it },
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
                    placeholder = { Text(text = "Enter your Height in m") }
                )

                Spacer(modifier = Modifier.height(15.dp))

                Button(
                    onClick = {

                        c = (a.toFloat() / (b.toFloat() * b.toFloat())).toString()

                    },
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .height(55.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text(text = "Calculate BMI", fontSize = 18.sp)
                }
                Spacer(modifier = Modifier.height(15.dp))

                Text(
                    textAlign = TextAlign.Center,
                    text = "BMI RESULT : $c",
                    fontSize = 18.sp,
                    color = Color.Blue, fontWeight = FontWeight.Bold
                )
                /*Row {
                    Button(
                        onClick = { c = Multiplication(a.toFloat(), b.toFloat()).toString() },
                        modifier = Modifier
                            .padding(top = 15.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                    ) {
                        Text(text = "*")
                    }
                    Button(
                        onClick = { c = Subtraction(a.toFloat(), b.toFloat()).toString() },
                        modifier = Modifier
                            .padding(top = 15.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                    ) {
                        Text(text = "-")
                    }
                    Button(
                        onClick = { c = Division(a.toFloat(), b.toFloat()).toString() },
                        modifier = Modifier
                            .padding(top = 15.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                    ) {
                        Text(text = "/")
                    }
                }*/
            }
        }


    }


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun SignUpScreen() {
        var a by remember { mutableStateOf("") }
        var b by remember { mutableStateOf("") }
        Column(
            modifier = Modifier.padding(15.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.flower_img),
                contentDescription = "Login Image",
            )
            Text(
                textAlign = TextAlign.Start,
                text = "Login",
                fontSize = 28.sp,
                color = Color.Blue
            )
            Text(
                text = "User Name", textAlign = TextAlign.Start,
                fontSize = 22.sp,
                color = Color.Blue,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp)
            )
            TextField(
                value = a,
                onValueChange = { a = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp),
                placeholder = { Text(text = "Enter your Username") }
            )

            Text(
                textAlign = TextAlign.Start,
                text = "Password",
                fontSize = 22.sp,
                color = Color.Blue,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp)
            )
            TextField(
                value = b,
                onValueChange = { b = it },
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text(text = "Enter your Password") }
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(
                    onClick = { },
                    modifier = Modifier
                        .padding(top = 15.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Red)

                ) {
                    Text(text = "Sign In")
                }
                Row {

                    Button(
                        onClick = { },
                        modifier = Modifier
                            .padding(top = 15.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                    ) {
                        Text(text = "*")
                    }
                    Button(
                        onClick = { },
                        modifier = Modifier
                            .padding(top = 15.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                    ) {
                        Text(text = "-")
                    }

                    Button(
                        onClick = { },
                        modifier = Modifier
                            .padding(top = 15.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                    ) {
                        Text(text = "/")
                    }
                }

            }

        }
    }


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun FacebookSignUpScreen() {

        var loginFirstName by remember { mutableStateOf("") }
        var loginSurName by remember { mutableStateOf("") }
        var loginEmailOrMobile by remember { mutableStateOf("") }
        var loginNewPassword by remember { mutableStateOf("") }

        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.White
        ) {
            Column(
                /*modifier = Modifier.padding(15.dp),*/
                verticalArrangement = Arrangement.Center,
            ) {
                Card(
                    modifier = Modifier.padding(15.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    shape = RoundedCornerShape(8.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)
                ) {
                    Column(
                        modifier = Modifier.verticalScroll(rememberScrollState()),
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Column(
                            modifier = Modifier.padding(15.dp),
                            verticalArrangement = Arrangement.Center,
                        ) {
                            Text(
                                textAlign = TextAlign.Start,
                                text = "Sign Up",
                                fontSize = 28.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.fillMaxWidth()
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                textAlign = TextAlign.Start,
                                text = "It's Quick and easy",
                                fontSize = 18.sp,
                                color = Color.Gray,
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                        Divider(
                            Modifier
                                .height(0.5.dp)
                                .background(color = Color.Black)
                        )
                        Column(
                            modifier = Modifier.padding(15.dp),
                            verticalArrangement = Arrangement.Center,
                        ) {
                            Spacer(modifier = Modifier.height(5.dp))
                            Row {
                                OutlinedTextField(
                                    value = loginFirstName,
                                    onValueChange = { loginFirstName = it },
                                    modifier = Modifier
                                        .weight(1f),
                                    placeholder = {
                                        Text(
                                            text = "First name",
                                            color = Color.Gray
                                        )
                                    },
                                    colors = TextFieldDefaults.textFieldColors(containerColor = Grey),
                                )

                                Spacer(modifier = Modifier.width(10.dp))

                                OutlinedTextField(
                                    value = loginSurName,
                                    onValueChange = { loginSurName = it },
                                    modifier = Modifier
                                        .weight(1f),
                                    placeholder = {
                                        Text(
                                            text = "Surname",
                                            color = Color.Gray
                                        )
                                    },
                                    colors = TextFieldDefaults.textFieldColors(containerColor = Grey)
                                )
                            }
                            Spacer(modifier = Modifier.height(15.dp))
                            OutlinedTextField(
                                value = loginEmailOrMobile,
                                onValueChange = { loginEmailOrMobile = it },
                                modifier = Modifier
                                    .fillMaxWidth(),
                                placeholder = {
                                    Text(
                                        text = "Mobile number or email address",
                                        color = Color.Gray
                                    )
                                }, colors = TextFieldDefaults.textFieldColors(containerColor = Grey)

                            )
                            Spacer(modifier = Modifier.height(15.dp))
                            OutlinedTextField(
                                value = loginNewPassword,
                                onValueChange = { loginNewPassword = it },
                                modifier = Modifier

                                    .fillMaxWidth(),
                                placeholder = {
                                    Text(
                                        text = "New Password",
                                        color = Color.Gray
                                    )
                                },
                                colors = TextFieldDefaults.textFieldColors(containerColor = Grey),
                                visualTransformation = PasswordVisualTransformation()

                            )
                            Spacer(modifier = Modifier.height(15.dp))
                            Text(
                                textAlign = TextAlign.Start,
                                text = "People who use our service may have uploaded your contact information to Facebook. Learn more.",
                                fontSize = 12.sp,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth()
                            )
                            Spacer(modifier = Modifier.height(15.dp))
                            Text(
                                textAlign = TextAlign.Start,
                                text = "By clicking Sign Up, you agree to our Terms, Privacy Policy and Cookies Policy. You may receive SMS notifications from us and can opt out at any time.",
                                fontSize = 12.sp,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth()
                            )
                            Button(
                                onClick = { },
                                modifier = Modifier
                                    .padding(top = 15.dp, start = 45.dp, end = 45.dp)
                                    .fillMaxWidth()
                                    .height(55.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = Green),
                                shape = RoundedCornerShape(5.dp)
                            ) {
                                Text(
                                    text = "Sign Up",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 22.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun FacebookSignUpScreenPreview() {
        CalculatorAppTheme {
            CalculatorView()
        }
    }

}

