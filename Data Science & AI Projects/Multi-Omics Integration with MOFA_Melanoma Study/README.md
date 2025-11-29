# Multi-Omics Integration with MOFA (Melanoma Study)

Applied **MOFA (Multi-Omics Factor Analysis)** to integrate clinical and mRNA expression datasets from the *Acral Melanoma (TGEN, 2017)* study (cBioPortal).  
The goal was to identify latent factors explaining variation across patients and uncover potential biomarkers and disease patterns.

## What I Did
- Preprocessed clinical and gene expression data (normalisation, encoding, scaling, missing-value handling)
- Trained a MOFA model to learn shared and view-specific latent factors
- Analysed factors to link molecular patterns with clinical traits (stage, site, mutation burden)
- Visualised latent structure and gene/feature contributions

## Tools
Python, MOFA+, Pandas, NumPy, Scikit-Learn, Matplotlib

Data source: https://www.cbioportal.org/study/summary?id=mel_tsam_liang_2017
