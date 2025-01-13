package com.example.enguidanos.biometria_jaime;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Vincula el layout de la SplashActivity
        setContentView(R.layout.activity_splash);

        // Encuentra el logo desde el layout
        findViewById(R.id.logo).startAnimation(getFadeOutAnimation());

        // Retrasa 2 segundos antes de pasar al MainActivity
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
            startActivity(intent);
            finish(); // Finaliza la SplashActivity para que no vuelva al presionar "Back"
        }, 2000); // 2000 ms = 2 segundos
    }

    /**
     * Obtiene la animación de fade-out desde res/anim/fade_out.xml.
     */
    private Animation getFadeOutAnimation() {
        return AnimationUtils.loadAnimation(this, R.anim.fade_out);
    }
}
