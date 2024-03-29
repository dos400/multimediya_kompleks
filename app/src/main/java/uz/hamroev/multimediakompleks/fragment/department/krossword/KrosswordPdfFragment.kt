package uz.hamroev.multimediakompleks.fragment.department.krossword

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.cache.Cache
import uz.hamroev.multimediakompleks.databinding.FragmentKrosswordPdfBinding

class KrosswordPdfFragment : Fragment() {


    lateinit var binding: FragmentKrosswordPdfBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentKrosswordPdfBinding.inflate(layoutInflater)

        loadPdfs()
        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }

        return binding.root
    }

    private fun loadPdfs() {
        when (Cache.kross) {
            "1" -> {
                Cache.krosswordfoiz = 20
                binding.pdfView.fromAsset("cross8.pdf").show()
            }
            "2" -> {
                Cache.krosswordfoiz = 40
                binding.pdfView.fromAsset("cross9.pdf").show()
            }
            "3" -> {
                Cache.krosswordfoiz = 60
                binding.pdfView.fromAsset("cross10.pdf").show()
            }
            "4" -> {
                Cache.krosswordfoiz = 80
                binding.pdfView.fromAsset("cross11one.pdf").show()
            }
            "5" -> {
                Cache.krosswordfoiz = 100
                binding.pdfView.fromAsset("cross11two.pdf").show()
            }
        }
    }



}