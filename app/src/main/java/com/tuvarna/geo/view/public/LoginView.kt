package com.tuvarna.geo.view.public

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.tuvarna.geo.R
import com.tuvarna.geo.entity.UserEntity
import com.tuvarna.geo.view.component.accessibility.LoadingIndicator
import com.tuvarna.geo.viewmodel.LoginViewModel

@Composable
fun LoginView(navController: NavController) {
  val loginViewModel = hiltViewModel<LoginViewModel>()
  val user by remember { mutableStateOf(UserEntity(0, "", "", "", false)) }

  LoadingIndicator(
    stateFlow = loginViewModel.stateFlow.collectAsState().value,
    navController = navController,
    route = "home",
  )
  Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxWidth()) {
    Column(
      modifier = Modifier.padding(5.dp).fillMaxWidth(0.8f),
      verticalArrangement = Arrangement.Center,
    ) {
      Text(
        text = "Login",
        style = MaterialTheme.typography.bodyMedium,
        modifier = Modifier.padding(16.dp).align(Alignment.CenterHorizontally),
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
      )

      Spacer(modifier = Modifier.height(20.dp))

      Image(
        painter = painterResource(id = R.drawable.earth),
        contentDescription = "Earth Icon",
        modifier = Modifier.size(110.dp).fillMaxWidth().align(Alignment.CenterHorizontally),
      )

      Spacer(modifier = Modifier.height(20.dp))

      LoginForm(user = user, loginViewModel = loginViewModel, navController = navController)
    }
  }
}

@Composable
fun LoginForm(navController: NavController, user: UserEntity, loginViewModel: LoginViewModel) {

  val isEmailValid = user.email.isEmpty() // || Utils.isValidEmail(user.email)
  val isPasswordValid = user.password.isEmpty() // || Utils.isValidPassword(user.password)
  val isSubmitBtnDisabled = isEmailValid || isPasswordValid

  val textFieldModifier: Modifier = Modifier.fillMaxWidth().padding(8.dp).height(60.dp)
  val errorTextModifier: Modifier = Modifier.fillMaxWidth().padding(start = 8.dp)

  OutlinedTextField(
    value = user.email,
    isError = isEmailValid,
    onValueChange = { user.email = it },
    label = { Text("Email") },
    keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
    modifier = textFieldModifier,
  )

  if (isEmailValid) {
    Text(
      text = "Email is invalid",
      color = Color.Red,
      style = MaterialTheme.typography.bodyMedium,
      modifier = errorTextModifier,
    )
  }

  OutlinedTextField(
    value = user.password,
    isError = isPasswordValid,
    onValueChange = { user.password = it },
    label = { Text("Password") },
    visualTransformation = PasswordVisualTransformation(),
    keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
    modifier = textFieldModifier,
  )

  if (isPasswordValid) {
    Text(
      text = "Password does not conform the rules",
      color = Color.Red,
      style = MaterialTheme.typography.bodyMedium,
      modifier = errorTextModifier,
    )
  }

  Row(
    modifier = Modifier.fillMaxWidth().padding(8.dp),
    horizontalArrangement = Arrangement.SpaceBetween,
  ) {
    Button(
      onClick = { loginViewModel.login(user) },
      enabled = !isSubmitBtnDisabled,
      modifier = Modifier.weight(1f).padding(end = 10.dp),
    ) {
      Text("Login")
    }
    Button(
      onClick = { navController.navigate("signup") },
      modifier = Modifier.weight(1f).padding(end = 10.dp),
    ) {
      Text("Sign up")
    }
  }
}
