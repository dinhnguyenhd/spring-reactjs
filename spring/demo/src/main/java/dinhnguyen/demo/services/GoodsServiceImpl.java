package dinhnguyen.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import dinhnguyen.demo.entity.Goods;
import dinhnguyen.demo.repository.GoodsRepository;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsRepository goodsRepository;

	@Override
	public List<Goods> list() {
		return this.goodsRepository.findAll();
	}

	@Override
	public Goods add(Goods goods) {
		return this.goodsRepository.save(goods);
	}

	@Override
	public Goods get(Long id) {
		return this.goodsRepository.getOne(id);
	}

	@Override
	public Goods update(Goods goods) {
		return this.goodsRepository.save(goods);
	}

	@Override
	public void delete(Long id) {
		this.goodsRepository.deleteById(id);
	}

	@Override
	public List<Goods> searchByConditions(String code, String name, int page) {
		Pageable pageable = PageRequest.of(page, 2);
		String sqlCode = null;
		String sqlName = null;
		if (code != null && code.trim().length() > 0) {
			sqlCode = "%" + code.trim() + "%";
		}
		if (name != null && name.trim().length() > 0) {
			sqlName = "%" + name.trim() + "%";
		}
		return this.goodsRepository.searchByConditions(sqlCode, sqlName, pageable);

	}

	@Override
	public int numberOfRecord(String code, String name) {
		String sqlCode = null;
		String sqlName = null;
		if (code != null && code.trim().length() > 0) {
			sqlCode = "%" + code.trim() + "%";
		}
		if (name != null && name.trim().length() > 0) {
			sqlName = "%" + name.trim() + "%";
		}
		return this.goodsRepository.numberOfRecord(sqlCode, sqlName);

	}

}
