package uz.hamroev.multimediakompleks.fragment.department

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.cache.Cache
import uz.hamroev.multimediakompleks.databinding.FragmentMaruzaBinding

class MaruzaFragment : Fragment() {


    lateinit var binding: FragmentMaruzaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMaruzaBinding.inflate(layoutInflater)

        /* 2 ta bo'lim

        1-Период колониализма
        2-Джадиды

        */

        loadPdf()
        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }


        return binding.root
    }

    private fun loadPdf() {
        when (Cache.language) {
            "ru" -> {
                binding.pdfView.fromAsset("maruza_ru.pdf").show()
            }
            "uz" -> {
                binding.pdfView.fromAsset("maruza.pdf").show()
            }
        }

    }

    override fun onResume() {
        super.onResume()
        Cache.maruzafoiz = 100
    }

}