package io.imagekit.imagekitdemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.imagekit.android.ImageKit
import com.imagekit.android.entity.TransformationPosition
import io.imagekit.imagekitdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        ImageKit.init(
            context = applicationContext,
            publicKey = "public_5P5QM23aRv9XkOcfJO1okZ0DzOw=",
            urlEndpoint = "https://ik.imagekit.io/tqhfz73me",
            transformationPosition = TransformationPosition.PATH,
        )

        binding?.btUrlConstruct?.setOnClickListener{
            startActivity(Intent(this@MainActivity, FetchImageActivity::class.java))
        }

        binding?.btUploadImage?.setOnClickListener{
            startActivity(Intent(this@MainActivity, UploadImageActivity::class.java))
        }

        binding?.btUploadFile?.setOnClickListener {
            startActivity(Intent(this@MainActivity, UploadFileActivity::class.java))
        }

        binding?.btAdaptiveStream?.setOnClickListener {
            startActivity(Intent(this@MainActivity, AdaptiveVideoStreamActivity::class.java))
        }
    }

}