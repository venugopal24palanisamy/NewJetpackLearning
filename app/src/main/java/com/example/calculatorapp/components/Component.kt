package com.example.calculatorapp.components

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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculatorapp.R
import com.example.calculatorapp.ui.theme.CalculatorAppTheme
import com.example.calculatorapp.ui.theme.Grey
import com.example.calculatorapp.ui.theme.LightBlueColor
import com.example.calculatorapp.ui.theme.Blue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InstagramSignUp() {

    var loginFirstName by remember { mutableStateOf("") }
    var loginSurName by remember { mutableStateOf("") }
    var loginEmailOrMobile by remember { mutableStateOf("") }
    var loginNewPassword by remember { mutableStateOf("") }
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Column(
            modifier = Modifier
                .padding(15.dp)
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Center
        ) {

            Column(
                modifier = Modifier.padding(15.dp),
                verticalArrangement = Arrangement.Center,
            ) {

                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(75.dp),
                    painter = painterResource(id = R.drawable.instagram_logo),
                    contentDescription = "Instagram Image",
                )

                Spacer(modifier = Modifier.height(15.dp))

                Text(
                    textAlign = TextAlign.Center,
                    text = "Sign up to see photos and videos from your friends.",
                    fontSize = 18.sp,
                    color = Color.Black,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(15.dp))
                Button(
                    onClick = { },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Blue),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Row( horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically) {

                        Image(
                            modifier = Modifier
                                .height(35.dp).width(35.dp),
                            painter = painterResource(id = R.drawable.facebook_logo),
                            contentDescription = "Instagram Image",
                        )
                        Spacer(modifier = Modifier.width(15.dp))
                        Text(
                            text = "Login with Facebook",
                            fontWeight = FontWeight.Bold,
                            fontSize = 22.sp
                        )
                    }

                }
            }

            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Divider(
                    Modifier
                        .height(0.5.dp)
                        .weight(1f)
                        .background(color = Color.Black)
                )
                Text(
                    textAlign = TextAlign.Center,
                    text = "OR",
                    fontSize = 18.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(10.dp)
                )
                Divider(
                    Modifier
                        .height(0.5.dp)
                        .weight(1f)
                        .background(color = Color.Black)
                )
            }

            Column(
                modifier = Modifier.padding(15.dp),
                verticalArrangement = Arrangement.Center,
            ) {
                OutlinedTextField(
                    value = loginEmailOrMobile,
                    onValueChange = { loginEmailOrMobile = it },
                    modifier = Modifier
                        .fillMaxWidth(),
                    placeholder = {
                        Text(
                            text = "Mobile number or Email",
                            color = Color.Gray
                        )
                    }, colors = TextFieldDefaults.textFieldColors(containerColor = Grey)

                )
                Spacer(modifier = Modifier.height(10.dp))
                OutlinedTextField(
                    value = loginFirstName,
                    onValueChange = { loginFirstName = it },
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = {
                        Text(
                            text = "Full name",
                            color = Color.Gray
                        )
                    },
                    colors = TextFieldDefaults.textFieldColors(containerColor = Grey),
                )
                Spacer(modifier = Modifier.height(10.dp))
                OutlinedTextField(
                    value = loginSurName,
                    onValueChange = { loginSurName = it },
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = {
                        Text(
                            text = "Username",
                            color = Color.Gray
                        )
                    },
                    colors = TextFieldDefaults.textFieldColors(containerColor = Grey)
                )
                Spacer(modifier = Modifier.height(10.dp))

                OutlinedTextField(
                    value = loginNewPassword,
                    onValueChange = { loginNewPassword = it },
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = {
                        Text(
                            text = "Password",
                            color = Color.Gray
                        )
                    },
                    colors = TextFieldDefaults.textFieldColors(containerColor = Grey),
                    visualTransformation = PasswordVisualTransformation()

                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    textAlign = TextAlign.Center,
                    text = "People who use our service may have uploaded your contact information to Facebook. Learn more.",
                    fontSize = 12.sp,
                    color = Color.Black,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    textAlign = TextAlign.Center,
                    text = "By clicking Sign Up, you agree to our Terms, Privacy Policy and Cookies Policy. You may receive SMS notifications from us and can opt out at any time.",
                    fontSize = 12.sp,
                    color = Color.Black,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(15.dp))
                Button(
                    onClick = { },
                    modifier = Modifier
                        .padding(top = 15.dp, start = 10.dp, end = 10.dp)
                        .fillMaxWidth()
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = LightBlueColor),
                    shape = RoundedCornerShape(10.dp)
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

@Preview(showBackground = true)
@Composable
fun InstagramSignUpPreview() {
    CalculatorAppTheme {
        InstagramSignUp()
    }
}