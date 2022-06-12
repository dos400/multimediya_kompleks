package uz.hamroev.multimediakompleks.fragment.department.meyoriy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.cache.Cache
import uz.hamroev.multimediakompleks.databinding.FragmentMeyoriyPdfBinding

class MeyoriyPdfFragment : Fragment() {


    lateinit var binding: FragmentMeyoriyPdfBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMeyoriyPdfBinding.inflate(layoutInflater, container, false)

        loadPdfs()
        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }

        return binding.root
    }

    private fun loadPdfs() {
        when (Cache.doc1) {
            "1" -> {
                binding.pdfView.fromAsset("doc1.pdf").show()
            }
            "2" -> {
                binding.pdfView.fromAsset("doc2.pdf").show()
            }
            "3" -> {
                binding.pdfView.fromAsset("doc3.pdf").show()
            }
            "4" -> {
                binding.pdfView.fromAsset("doc4.pdf").show()
            }
            "5" -> {
                binding.pdfView.fromAsset("doc5.pdf").show()
            }
            "6" -> {
                binding.pdfView.fromAsset("doc6.pdf").show()
            }
        }
    }


}